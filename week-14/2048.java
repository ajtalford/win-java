package com.codegym.games.game2048;
import com.codegym.engine.cell.*;


public class Game2048 extends Game{

    private static final int SIDE = 4;
    private int[][] gameField = new int[4][4];
    private boolean isGameStopped = false;
    private int score = 0;
    private void createGame(){
        gameField = new int[4][4];        
        createNewNumber();
        createNewNumber();
    }
    
        @Override
    public void onKeyPress(Key key){
        if(isGameStopped){
            
            if(key == Key.SPACE){
                isGameStopped = false;
                score = 0;
                setScore(score);
                createGame();
                drawScene();
            }
        }
        else if( canUserMove() ){
        
            if (key == Key.LEFT){
            moveLeft();
            }
            else if (key == Key.RIGHT){
            moveRight();
            }
            else if (key == Key.UP){
                moveUp();
            }
            else if (key == Key.DOWN){
            moveDown();
            }
            drawScene();
            }
        else{
            gameOver(); }
    }
    
    private void drawScene(){
        for(int i=0 ; i<SIDE; i++){
            for(int j=0; j<SIDE ; j++){
                setCellColoredNumber(i , j, (gameField[j][i]));
            } 
        }
    }
    
    private void createNewNumber() {
    int maxTileValue = getMaxTileValue();
    if (maxTileValue == 2048) win();
    int x = getRandomNumber(SIDE);
    int y = getRandomNumber(SIDE);
    if (gameField[y][x] != 0) {
        createNewNumber();
    } else {
        int i = getRandomNumber(10);
        int num;
        if (i == 9)
            num = 4;
        else
            num = 2;
        gameField[y][x] = num;
    }
}
    
    
    private Color getColorByValue(int value){
        switch(value){
        case 0: return Color.WHITE;
        case 2: return Color.GRAY;
        case 4: return Color.VIOLET;
        case 8: return Color.PURPLE;
        case 16: return Color.INDIGO;
        case 32: return Color.BLUE;
        case 64: return Color.GREEN;
        case 128: return Color.YELLOW;
        case 256: return Color.ORANGE;
        case 512: return Color.PINK;
        case 1024: return Color.RED;
        case 2048: return Color.BROWN;
        default: return Color.WHITE;
        }
    }
    
    private void setCellColoredNumber(int x, int y, int value){
        if (value != 0){
            setCellValueEx(x, y, getColorByValue(value) , Integer.toString(value));
        } 
        else{
            setCellValueEx(x, y, getColorByValue(value) , "");
        }
    }
    
    private boolean compressRow(int[] row){
        int temp = 0;
        boolean shifted = false;
            for(int a=0; a < SIDE - 1 ; a++){
                for(int b = 0; b < SIDE - 1 ; b++){
                    if(row[b] == 0 && row[b+1] !=0){
                        shifted = true;
                        for( int c=b ; c < SIDE-1 ; c++){
                        temp = row[c+1];
                        row[c+1] = row[c];
                        row[c] = temp;
                        }
                    }
                }
            }
        return shifted;   
    }
    
    private boolean mergeRow(int[] row){
        boolean f = false;
        for(int i =0 ; i < SIDE-1 ; i++){
            if (row[i] == row[i+1] && row[i] != 0){
                score += (row[i] + row[i+1]);
                setScore( score );
                row[i] *= 2;
                row[i+1]=0;
                f = true;
            }
        }
        
        return f;
    }
    
    private int getMaxTileValue(){
        int max = 0;
        for(int i = 0; i < SIDE ; i++){
            int[] row = gameField[i];
            for(int j = 0; j< SIDE ; j++){
                if( max <= row[j] ){
                    max = row[j];
                }
            }
        }
        return max; 
    }
    
    
    private void moveLeft(){
        boolean compress;
        boolean merge;
        boolean compresss;
        int move = 0;
        for (int i = 0; i < SIDE; i++){
            compress = compressRow(gameField[i]);
            merge = mergeRow(gameField[i]);
            compresss=compressRow(gameField[i]);
            if (merge || compress || compresss){
            move++;
            }
        } 
        if (move > 0){
            createNewNumber();
        }
    }
    
    private void moveRight(){
        rotateClockwise();
        rotateClockwise();
        moveLeft();
        rotateClockwise();
        rotateClockwise();
    }
    
    private void moveUp(){
        rotateClockwise();
        rotateClockwise();
        rotateClockwise();
        moveLeft();
        rotateClockwise();
    }
    
    private void moveDown(){
        rotateClockwise();
        moveLeft();
        rotateClockwise();
        rotateClockwise();
        rotateClockwise();
    }
    
    private void rotateClockwise(){
        int[][] tempMat = new int[SIDE][SIDE];
        for(int r = 0; r<SIDE; r++){
            for(int c = 0; c<SIDE ; c++){
                tempMat[c][SIDE - 1 - r] = gameField[r][c];
            }
        }
        for(int r = 0; r < SIDE; r++){
            for (int c = 0; c < SIDE; c++){
                gameField[r][c] = tempMat[r][c];
            }
        }
    }
    
    @Override
    public void initialize(){
       setScreenSize(SIDE , SIDE);
       createGame();
       drawScene();
    }

    private boolean canUserMove(){
        for(int i = 0; i < SIDE ; i++)
            for(int j = 0; j  < SIDE ; j++)
                if( gameField[i][j] == 0)
                return true;
                
        for(int i = 0; i<SIDE ;i++)
            for(int j = 0; j  < SIDE-1 ; j++)
                if(gameField[i][j] == gameField[i][j+1])
                return true;
        
        for(int i = 0; i<SIDE-1 ;i++)
            for(int j = 0; j  < SIDE ; j++)
                if(gameField[i][j] == gameField[i+1][j])
                return true;
        
        return false;
    }
    
    private void win(){
        isGameStopped = true;
        showMessageDialog(Color.RED , "You Won" , Color.BLACK , 20 );
    }
    
    private void gameOver(){
        isGameStopped = true;
        showMessageDialog(Color.RED , "You Lost" , Color.BLACK , 20 );
        
    }
    
}   