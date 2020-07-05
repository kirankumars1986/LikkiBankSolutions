/**
 * 
 */
package com.likki.bank.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.likki.bank.DAO.LBSRegisterUserDAO;
import com.likki.bank.domain.LBSUserDetailsDomain;
import com.likki.bank.service.LBSRegisterUserService;

/**
 * @author KV
 *
 */
public class LBSRegisterUserServiceImpl implements LBSRegisterUserService {

	@Autowired
	LBSRegisterUserDAO lbsRegisterUserDAO;
	
	@Override
	public LBSUserDetailsDomain saveUserDetails(LBSUserDetailsDomain lbsUserDetailsDomain) {
		// TODO Auto-generated method stub
		return lbsRegisterUserDAO.save(lbsUserDetailsDomain);
	}

}
