/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algumalexico;

import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author mbern
 */
public class Principal {
     public static void main(String args[]) throws IOException{
       CharStream cs = CharStreams.fromFileName(args[0]);
       AlgumaLexer lex = new AlgumaLexer(cs);
       
       Token t = null;
       while((t=lex.nextToken()).getType() != Token.EOF){
           System.out.println("<"+ AlgumaLexer.VOCABULARY.getDisplayName(t.getType()) + "," + t.getText()+">");
       }       
    }
}
