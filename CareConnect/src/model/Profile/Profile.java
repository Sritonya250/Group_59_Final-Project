/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.profile;

import model.person.Person;

/**
 *
 * @author tbhar
 */
public abstract class Profile {
    Person person;

    public Profile(Person p) {
        this.person = p;
    }
    
    public abstract UserRole getRole();

    public Person getPerson() {
        return person;
    }
    
    public boolean isMatch(String id) {
        if (person.getPersonId().equals(id)) {
            return true;
        }
        return false;
    }
}
