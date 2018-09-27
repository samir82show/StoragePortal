package controller;

import entity.Category;
import entity.CategoryFacade;
import entity.Data;
import entity.DataFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Inject;

@Named(value = "controller")
@SessionScoped
public class Controller implements Serializable {

    @EJB
    private DataFacade dataFacade;

    @EJB
    private CategoryFacade categoryFacade;

    @Inject
    private Category category;
    @Inject
    private Data data;
    
    public String findAll() {
        List<Data> dataList = dataFacade.findAll();
//        System.out.println("Data: " + dataList.get(0).getTotal());
        System.out.println(dataList.get(0).toString());
        return dataList.get(0).toString();
    }

}
