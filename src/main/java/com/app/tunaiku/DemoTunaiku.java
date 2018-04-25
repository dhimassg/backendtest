/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.tunaiku;

import com.app.tunaiku.model.EvenOddsNumber;
import com.app.tunaiku.model.NominalAmount;
import com.app.tunaiku.model.PrimeNumber;
import com.app.tunaiku.repo.EvenOddsNumberRepository;
import com.app.tunaiku.repo.NominalAmountRepository;
import com.app.tunaiku.repo.PrimeNumberRepository;
import com.app.tunaiku.utils.GeneratorMenyebutBilangan;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.hateoas.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author <Dhimas Surya G>
 */
@RestController
@RequestMapping(value = "demo")
public class DemoTunaiku {

    JSONObject result = new JSONObject();
    JSONArray arr = null;

    @Autowired
    private NominalAmountRepository nar;

    @Autowired
    private EvenOddsNumberRepository eonr;

    @Autowired
    private PrimeNumberRepository pnr;

    
    @GetMapping(value = "data")
    public String data() {

        try {
            // point 1 //
            Point1();
            arr = new JSONArray();
            result.put("point1 ", "success added");
            arr.add(result);
            //====================//

            // point2  //
            Point2();
            result = new JSONObject();
            result.put("point2 ", "success added");
            arr.add(result);
            //====================//

            // point3  //
            Point3();
            result = new JSONObject();
            result.put("point3 ", "success added");
            arr.add(result);
            //====================//
        } catch (Exception e) {
            e.getMessage();
        }
        return JSONArray.toJSONString(arr);
    }

    public void Point1() {
        Integer num1 = 1;
        String bilangan1 = "";
        while (num1 <= 1000000) {
            bilangan1 = GeneratorMenyebutBilangan.getTerbilang(Long.valueOf(num1));
            PrimeNumber primeNumber = new PrimeNumber(num1, GeneratorMenyebutBilangan.getTerbilang(Long.valueOf(num1)));
            pnr.save(primeNumber);
            num1++;
        }

    }

    public void Point2() {
        Integer num2 = 1;
        String bilangan2 = "";
        while (num2 <= 1000000) {
            Integer total = num2 + num2;
            bilangan2 = GeneratorMenyebutBilangan.getTerbilang(Long.valueOf(total));
            EvenOddsNumber oddsNumber = new EvenOddsNumber(num2, num2, total, GeneratorMenyebutBilangan.getTerbilang(Long.valueOf(total)));
            eonr.save(oddsNumber);
            num2++;
        }

    }

    public void Point3() {
        Long a = 2000000L;
        Long b = 0L;
        Long c = a + b;
        Long d;
        Long stop = 15000000L;
        Long result;
        for (int i = 0; i < 50; i++) {
            d = a;
            b = a / 12 + (a * 3 / 100);
            result = b + a;
            a = result;
            if ((result >= stop)) {
                break;
            }
            NominalAmount na = new NominalAmount();
            na.setNominal(Double.valueOf(d));
            na.setAdditional_number(b.intValue());
            na.setTotal(Double.valueOf(result));
            nar.save(na);
        }

    }
    


}
