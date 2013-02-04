package com.springinpractice.ch13.helpdesk.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.repository.annotation.RestResource;

import com.springinpractice.ch13.helpdesk.model.TicketCategoryEntity;

/**
 * @author Willie Wheeler (willie.wheeler@gmail.com)
 */
@RestResource(path = "ticketcategories")
public interface TicketCategoryRepository extends JpaRepository<TicketCategoryEntity, Long> {
	
	TicketCategoryEntity findByKey(String key);
}
