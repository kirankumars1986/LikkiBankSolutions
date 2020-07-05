/**
 * 
 */
package com.likki.bank.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.likki.bank.domain.LBSUserDetailsDomain;

/**
 * @author KV
 *
 */
@Repository
public interface LBSRegisterUserDAO extends JpaRepository<LBSUserDetailsDomain, Integer>{
	
}
