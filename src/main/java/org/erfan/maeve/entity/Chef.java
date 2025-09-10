package org.erfan.maeve.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@Table(name = "chef")
@SQLDelete(sql = "UPDATE chef SET is_active = false WHERE chef_id = ?")
@Where(clause = "is_active = true")
public class Chef extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long chefId;

    private String firstName;
    private String lastName;

    // Getter & Setter
    public Long getChefId() { return chefId; }
    public void setChefId(Long chefId) { this.chefId = chefId; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
}

