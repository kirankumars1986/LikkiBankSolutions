/**
 * 
 */
package com.likki.bank.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author KV
 *
 */
@Entity
@Table(name = "lbs_user_details")
@Data
public class LBSUserDetailsDomain {

	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	 	@Column(name="user_id", nullable=false)
	 	@JsonProperty(value = "userId")
	    private Integer userId;
	 	
	 	@Column(name="USER_NAME", nullable=false)
	 	@JsonProperty(value = "userName")
	    private String userName;
	 	
	 	@Column(name="PASSWORD", nullable=false)
	 	@JsonProperty(value = "password")
	    private String password;
	 	
	 	@Column(name="FIRST_NAME", nullable=false)
	 	@JsonProperty(value = "firstName")
	    private String firstName;
	 	
	 	@Column(name="LAST_NAME", nullable=false)
	 	@JsonProperty(value = "lastName")
	    private String lastName;	
	    
	    @Override
		public String toString() {
			return "LBSUserDetailsDomain [userId=" + userId + ", userName=" + userName + ", password=" + password
					+ ", firstName=" + firstName + ", lastName=" + lastName + "]";
		}
			
	    
	    
	    
}
