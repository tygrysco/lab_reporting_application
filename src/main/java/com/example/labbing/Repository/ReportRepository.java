package com.example.labbing.Repository;

import com.example.labbing.Model.Laborant;
import com.example.labbing.Model.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface ReportRepository extends JpaRepository<Report, Long> {


}