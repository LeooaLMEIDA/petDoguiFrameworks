package br.com.unipar.hibernateteste.model.dao;

import br.com.unipar.hibernateteste.model.Pet;

public class PetDAO extends GenericDAO<Pet> {

    public PetDAO() {
        super(Pet.class);
    }
}
