package it.unimi.di.prog2.esame.presenters;

import com.sun.scenario.effect.Blend;
import it.unimi.di.prog2.esame.model.Model;
import it.unimi.di.prog2.esame.model.Observable;
import it.unimi.di.prog2.esame.model.Skier;
import it.unimi.di.prog2.esame.views.RankView;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class SecRunPresenter implements Presenter{

    public SecRunPresenter(Model m, RankView view) {
        this.m = m;
        this.view = view;
        m.addObserver(this);
    }

    private final Model m;
    private final RankView view;
    @Override
    public void update(@NotNull Observable<List<Skier>> subject, @NotNull List<Skier> state) {
        int i =0;
        List<Skier> g = m.getGara();
        for (Skier s : g) {
            view.set(i, s.getName()+" "+s.getTime());
            i++;
        }
    }

    @Override
    public void action(String text1, String text2) {
//NULLA
    }
}
