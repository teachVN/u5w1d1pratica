package it.epicode.u5w1d1pratica;

import it.epicode.u5w1d1pratica.bean.Menu;
import it.epicode.u5w1d1pratica.bean.Ordine;
import it.epicode.u5w1d1pratica.bean.Tavolo;
import it.epicode.u5w1d1pratica.enumeration.StatoOrdine;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Component
public class NewCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(U5w1d1praticaApplication.class);

        Menu menu = ctx.getBean(Menu.class);
        menu.stampaMenu();

        Tavolo tavolo1 = ctx.getBean("tavolo1", Tavolo.class);

        Ordine ordine = new Ordine(5, tavolo1);

        ordine.setNumeroOrdine(1);
        ordine.setDataAcquisizione(LocalDateTime.now());
        ordine.setStatoOrdine(StatoOrdine.IN_CORSO);
        ordine.setBevande(List.of(menu.getBevande().get(0), menu.getBevande().get(1)));
        ordine.setIngredienti(List.of(menu.getIngredienti().get(0), menu.getIngredienti().get(1)));
        ordine.setPizze(List.of(menu.getPizze().get(0), menu.getPizze().get(0), menu.getPizze().get(1), menu.getPizze().get(1)));

        ordine.stampaOrdine();

    }
}
