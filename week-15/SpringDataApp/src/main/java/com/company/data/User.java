package com.company.data;
import java.util.Date;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

//import org.hibernate.annotations.CreationTimestamp;

//import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.Getter;
import lombok.NoArgsConstructor;
//import lombok.Setter;
import lombok.ToString;

@Data
@Entity
@NoArgsConstructor
@ToString
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private Long id;
	
	@NotBlank(message = "First Name is mandatory")
	private String firstName;

	private String lastName;

	@NotBlank(message = "Email is mandatory")
	private String email;

	private Date signedUp;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


public Date getSignedUp() {
		return signedUp;
	}

	public void setSignedUp(Date signedUp) {
		this.signedUp = signedUp;
	}

public User(String firstName, String lastName, String email, Date signedUp){
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;	
	this.signedUp = signedUp;
	
}

@Override
public String toString() {
	return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", signedUp="
			+ signedUp + "]";
}

}