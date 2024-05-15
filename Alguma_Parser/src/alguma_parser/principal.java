/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alguma_parser;

import algumalx.AlgumaLexico;

/**
 *
 * @author mbern
 */
public class principal {
    public static void main (String args []){
        AlgumaLexico lex = new AlgumaLexico(args[0]);
        Alguma_Parser parser = new Alguma_Parser(lex);
        parser.programa();
    }
    
}
