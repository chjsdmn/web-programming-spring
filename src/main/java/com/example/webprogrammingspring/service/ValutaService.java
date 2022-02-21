package com.example.webprogrammingspring.service;

import com.example.webprogrammingspring.model.Belop;
import com.example.webprogrammingspring.model.Valuta;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ValutaService {
    private final List<Valuta> valutaRegister = new ArrayList<>();

    public void loadValuta(){
        Valuta sek = new Valuta("SEK", 0.85);
        Valuta usd = new Valuta("USD", 8.96);
        Valuta eur = new Valuta("EUR", 10.21);

        valutaRegister.add(sek);
        valutaRegister.add(usd);
        valutaRegister.add(eur);
    }

    public double beregn(Belop belop){
        // System.out.println(belop.getValutaSort());
        // 如果传参名字不一样，比如参数belop的一个属性是sort，但作为object的belop的一个属性是valutaSort，那么这是结果为null！！！！！
        for(Valuta valuta : valutaRegister){
            //注意string比较要用.equals，这里的.equalsIgnoreCase()可以忽略大小写
            if(valuta.getValutaSort().equalsIgnoreCase(belop.getValutaSort())){
                return valuta.getValutaKurs() * belop.getVerdi();
            }
        }
        return 0.0;
    }
}
