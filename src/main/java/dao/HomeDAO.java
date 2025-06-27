package dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Home;

public interface HomeDAO extends JpaRepository<Home, String>{
	Optional<Home> findById(String id);
}
