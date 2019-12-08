/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;
import java.beans.*;
import java.io.Serializable;

public class tloginBean implements Serializable {
    public tloginBean(){}
        private String uname;
        private String pass;
        public String getUname(){
            return uname;
        }
        public void setUname(String uname){
            this.uname=uname;
        }
         public String getPass(){
            return pass;
        }
        public void setPass(String pass){
            this.pass=pass;
        }
        
    
}
