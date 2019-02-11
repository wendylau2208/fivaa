package com.fivaa;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.fivaa.service.FivaService;
import com.fivaa.service.impl.FivaServiceImpl;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wendy
 */
public class FivaaServiceTest {
    
    FivaService service;
    
    @Before
    public void setUp() {
        service = new FivaServiceImpl();
    }
    
    @After
    public void tearDown() {
        service = null;
    }


    @Test
    public void whenNumberBelowOneAndSuccess_thenExpectationSatisfied() {
        assertEquals("Minimal input adalah 1", service.process(0).get(0));
    }
    
    @Test
    public void whenNumberIsFiveAndSuccess_thenExpectationSatisfied() {
        List<String> result = service.process(5);
        assertEquals("4466666", result.get(0));
        assertEquals("335555", result.get(1));
        assertEquals("22444", result.get(2));
        assertEquals("1133", result.get(3));
        assertEquals("002", result.get(4));
    
    }
}
