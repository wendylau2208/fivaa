/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fivaa.service.impl;

import com.fivaa.service.FivaService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wendy
 */
public class FivaServiceImpl implements FivaService{

    @Override
    public List<String> process(int n) {
        List<String> result = new ArrayList<>();
        if(n > 1){
            for(int i = 1; i<=n ; i++){
               String output = "";
                for(int j=1; j<=2 ;j++){
                    output+= String.valueOf(n-i);
                }
                for(int k=0; k<=n-i; k++){
                    output+= String.valueOf(n+2-i);
                }
                result.add(output);
            }
        }
        else{
            result.add("Minimal input adalah 1");
        }
        return result;
    }
    
}
