package com.project2.repository;

import java.util.List;

import com.project2.entities.AAA;







public interface AAADAOInterface {
    
    /*
        This interface is where we will declare the methods that we need to test. all methods created here 
        will by default be considered public and abstract.
     */

// create

    
    AAA createRequest(AAA newRequest);
    
//reads

    List<AAA> getAllRequests();
 
// updates

    AAA updateRequest(AAA updatedRequest);

// deletes

    boolean removeRequest(AAA requestToBeDeleted);


}
