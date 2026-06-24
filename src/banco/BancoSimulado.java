package banco;
import java.util.ArrayList;
import modelos.Aluno;

public class BancoSimulado {
    public static ArrayList <Aluno> alunos = new ArrayList<>();
    
    public static int ID = 1;
    
    static {

        alunos.add(new Aluno(
                ID++,
                "val",
                "25-2N",
                "valen@email"
            )
        );
        
        alunos.add(new Aluno(
                ID++,
                "liege",
                "25-2N",
                "liege@email"
            )
        );
        /*alunos.add(new Aluno(
                ID++,
                "",
                "",
                ""
            )
        );*/
    }
}
