package project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import project.model.Ubigeo;

@Repository("ubigeoRepository")
public interface UbigeoRepository extends JpaRepository<Ubigeo, String> {
	
	@Query("select substring(u.id,1,2) as id, u.departamento as departamento  from Ubigeo u group by u.departamento")
	public abstract List<Ubigeo> findDepartamento();
	
	@Query("select substring(u.id,1,4) as id, u.provincia as provincia from Ubigeo u where substring(u.id,1,2) = ?1 and u.provincia != '' group by u.provincia")
	public abstract List<Ubigeo> findProvincia(String id);
	
	@Query("select u.id, u.distrito as distrito from Ubigeo u where substring(u.id,1,4)=?1 and distrito != '' group by u.distrito")
	public abstract List<Ubigeo> findDistrito(String id);
	
	public abstract Ubigeo findById(String id);	
}
