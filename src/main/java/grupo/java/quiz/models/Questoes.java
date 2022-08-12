package grupo.java.quiz.models;

import javax.persistence.*;

@Entity
public class Questoes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_questao;

    @Column(nullable = false, length = 500)
    private String pergunta;

    @Column(nullable = false, length = 500)
    private String a;

    @Column(nullable = false, length = 500)
    private String b;

    @Column(nullable = false, length = 500)
    private String c;

    @Column(nullable = false, length = 500)
    private String d;

    @Column(nullable = false, length = 500)
    private String e;

    @Column(nullable = false, length = 1)
    private String resposta;
}
