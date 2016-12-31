/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

import com.google.common.collect.Lists;
import java.util.List;

/**
 *
 * @author Tareq
 */
public class SPClass {
    private String spName;//OBJECT_NAME
    private List<String> spArgumentNames;

    public SPClass(String spName, List<String> spArgumentNames) {
        this.spName = spName;
        this.spArgumentNames = spArgumentNames;
    }

    public SPClass() {
        spArgumentNames = Lists.newLinkedList();
    }
    

    public String getSpName() {
        return spName;
    }

    public List<String> getSpArgumentNames() {
        return spArgumentNames;
    }

    public void setSpName(String spName) {
        this.spName = spName;
    }

    public void setSpArgumentNames(List<String> spArgumentNames) {
        this.spArgumentNames = spArgumentNames;
    }
        
}
