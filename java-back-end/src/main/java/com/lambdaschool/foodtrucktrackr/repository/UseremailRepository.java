package com.lambdaschool.foodtrucktrackr.repository;

import com.lambdaschool.foodtrucktrackr.models.Useremail;
import org.springframework.data.repository.CrudRepository;

/**
 * The CRUD Repository connecting Useremail to the rest of the application
 */
public interface UseremailRepository
    extends CrudRepository<Useremail, Long>
{
}
