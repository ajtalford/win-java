
    public class Pet {

        public static void main(String[] args) {

            Pet pet2 = new Pet();
            System.out.println(pet2.name);
            pet2.setName("Snoop Dog");
            pet2.setAge(6);
            pet2.setLocation("Long Beach");
            pet2.setType("Dirty Dog");
            // getName() and name are printing the same thing after name is set to Snoop Dog
            System.out.println(pet2.getName());
            System.out.println(pet2.name);

            Pet pet1 = new Pet("Goldy", "Mathews", "Golden Retriever", 1);
            System.out.println(pet1.getName());
            // getName() and name are both going to print the name as long as name is set
            System.out.printf("Now my pets name is %s I decide to change it from %s...\n", pet1.name, pet2.name);

            // printing all the pet properties
            System.out.printf("toString() helps converts the entire pet object %s to a string.", pet1.toString());

        }

        private String name, location, type;
        private int age;



        Pet(){
            this.name = "Tyson";
            this.location = "North Carolina";
            this.type = "Boxer";
            this.age = 4;
        }


        public Pet(String name, String location, String type, int age) {
            super();
            this.name = name;
            this.location = location;
            this.type = type;
            this.age = age;
        }



        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Pet{" +
                    "name='" + name + '\'' +
                    ", location='" + location + '\'' +
                    ", type='" + type + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
