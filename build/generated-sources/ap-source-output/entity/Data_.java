package entity;

import entity.Category;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-27T14:45:47")
@StaticMetamodel(Data.class)
public class Data_ { 

    public static volatile SingularAttribute<Data, Double> total;
    public static volatile SingularAttribute<Data, String> gatherDate;
    public static volatile SingularAttribute<Data, Long> id;
    public static volatile SingularAttribute<Data, Double> used;
    public static volatile SingularAttribute<Data, Category> type;

}