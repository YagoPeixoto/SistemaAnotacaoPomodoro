package controller;

import dao.AnotacaoDao;
import dao.MarcadorDao;
import dao.PomodoroDao;
import dao.UsuarioDao;
import model.Anotacao;
import model.Marcador;
import model.Pomodoro;
import model.Usuario;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        calendar.set(1995, 2, 23);
        Calendar calendar1 = new GregorianCalendar();
        calendar1.set(1989, 2, 14);
        Calendar calendar2 = new GregorianCalendar();
        calendar2.set(2016, 2, 15);

        Date data = calendar.getTime();
        Date data1 = calendar1.getTime();
        Date data2 = calendar2.getTime();

        Usuario user0 = new Usuario();
        user0.setNome("Jones");
        user0.setSobreNome("Minamoto");
        user0.setDataNascimento(data);
        user0.setUsuarioID("4");
        user0.setTempoPomodoro(20);
        user0.setTempoDescanco(5);
        user0.setTempoDescancoLongo(15);
        user0.setSessoesTrabalho(2);

        Anotacao an = new Anotacao();
        an.setIdUser(1);
        an.setTitulo("Penhasco dos ventos Uivantes");
        an.setConteudo("drama");
        an.setLembrete(null);
        an.setDataCricacao(data1);
        an.setUltimaModificacao(data2);
        an.setCor("Verde Escuro");
        an.setIdMarcacao(1);

        Pomodoro pru = new Pomodoro();
        pru.setIdUsuario(1);
        pru.setIdAnotacao(1);
        pru.setDataInicio(data2);
        pru.setDataFim(data2);

        Marcador mar = new Marcador();
        mar.setNome("Junior");
        mar.setCor("Azul");

        UsuarioDao user = new UsuarioDao();
        user.adiciona(user0);

        AnotacaoDao anD = new AnotacaoDao();
        anD.adiciona(an);

        PomodoroDao pdao = new PomodoroDao();
        pdao.adiciona(pru);

        MarcadorDao mardao = new MarcadorDao();
        mardao.adiciona(mar);


    }
}
