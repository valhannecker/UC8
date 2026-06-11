/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

import java.util.ArrayList;
import Modelo.Produto;

public class BancoSimulado {
    public static ArrayList<Produto> produtos = new ArrayList<>();
    
    public static int codProduto = 1;
    
    static {

        produtos.add(new Produto(
                codProduto ++,
                "garrafa",
                5.0,
                15
            )
        );
        produtos.add(new Produto(
                codProduto ++,
                "poteplástico",
                6.0,
                20
            )
        );
        produtos.add(new Produto(
                codProduto ++,
                "mochila",
                10.0,
                10
            )
        );
        produtos.add(new Produto(
                codProduto ++,
                "lapis",
                2.0,
                50
            )
        );
        produtos.add(new Produto(
                codProduto ++,
                "caneta",
                2.0,
                45
            )
        );
    }
}