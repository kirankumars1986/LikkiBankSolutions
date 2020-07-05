/**
 * 
 */
package com.likki.bank.service;

import org.springframework.stereotype.Component;

import com.likki.bank.domain.LBSUserDetailsDomain;

/**
 * @author KV
 *
 */
@Component
public interface LBSRegisterUserService {

	LBSUserDetailsDomain saveUserDetails(LBSUserDetailsDomain lbsUserDetailsDomain);
	
	
}
