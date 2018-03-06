package br.com.devmedia.mobile.signos;

import java.util.ArrayList;

/**
 * Created by david on 02/03/18.
 */

    public class InterpretadorSigno {
        private ArrayList<Signo> signos = new ArrayList<Signo>(){{
            add(new Signo(20, 18, 1, 2,"Camus de Aquário", "@drawable/aquario"));
            add(new Signo(19, 20, 2, 3,"Afrodite de Peixes", "@drawable/peixes"));
            add(new Signo(21, 19, 3, 4,"Mu de Áries", "@drawable/aries"));
            add(new Signo(20, 20, 4, 5, "Aldebaran de Touro", "@drawable/touro"));
            add(new Signo(21, 20, 5, 6, "Kanon de Gêmeos", "@drawable/gemeos"));
            add(new Signo(21, 22, 6, 7, "MascaraMorte Câncer", "@drawable/cancer"));
            add(new Signo(23, 22, 7, 8, "Aiolia de Leão", "@drawable/leao"));
            add(new Signo(23, 22, 8, 9, "Shaka de Virgem", "@drawable/virgem"));
            add(new Signo(23, 22, 9, 10, "Dohko de Libra", "@drawable/libra"));
                add(new Signo(23, 21, 10, 11, "Milo de Escorpião", "@drawable/escorpiao"));
            add(new Signo(22, 21, 11, 12, "Aiolos de Sagitário", "@drawable/sagitario"));
            add(new Signo(22, 19, 12, 1, "Shura de Capricórnio", "@drawable/capricoornio"));
        }
    };

    public Signo interpretar(int dia, int mes) {
        Signo signo = null;
        for (Signo s : signos) {
            if (s.getMesinicio() == mes && dia >= s.getDiainicio()) {
                signo = s;
                break;
            } else if (s.getMesfim() == mes && dia <= s.getDiafim()) {
                signo = s;
                break;
            }
        }
        return signo;
    }
}