package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Home;

public interface HomeDAO extends JpaRepository<Home, String>{

}
