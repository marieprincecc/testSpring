package entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity /** on peut utilisé l'annotation Table(name="nom de la table") pour mapper une entité a une table si le nom est different idem pour les champs avec Column*/
public class Customer {

    @Id
    private Long id;
    private String name;
    private int age;

    public Customer(){

    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id=id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }
}
