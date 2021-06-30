import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("..:: Teste ::..")
public class Teste1 {
	
	public void informarTextoDireto(String textoDireto) throws Exception {
		Robot robot = new Robot();
		String acao = null;
		
			if(textoDireto.equals("tcEnter")) { robot.keyPress(KeyEvent.VK_ENTER);   }else
			if(textoDireto.equals("tcUp")) { robot.keyPress(KeyEvent.VK_UP);              }else
			if(textoDireto.equals("tcDown")) { robot.keyPress(KeyEvent.VK_DOWN); }else
			if(textoDireto.equals("tcLeft")) { robot.keyPress(KeyEvent.VK_LEFT);          }else
			if(textoDireto.equals("tcRight")) { robot.keyPress(KeyEvent.VK_RIGHT);   }else
			{
				for(int i=0; i<textoDireto.length(); i+=1) {				
					acao = textoDireto.substring(i, i+1); // divide a String caractere a caractere
					char acaoAux = acao.charAt(0);
			        robot.delay(350);
					
			        switch (acaoAux) {
				        case 'a': robot.keyPress(KeyEvent.VK_A); break;
				        case 'b': robot.keyPress(KeyEvent.VK_B); break;
				        case 'c': robot.keyPress(KeyEvent.VK_C); break;
				        case 'd': robot.keyPress(KeyEvent.VK_D); break;
				        case 'e': robot.keyPress(KeyEvent.VK_E); break;
				        case 'f': robot.keyPress(KeyEvent.VK_F); break;
				        case 'g': robot.keyPress(KeyEvent.VK_G); break;
				        case 'h': robot.keyPress(KeyEvent.VK_H); break;
				        case 'i': robot.keyPress(KeyEvent.VK_I); break;
				        case 'j': robot.keyPress(KeyEvent.VK_J); break;
				        case 'k': robot.keyPress(KeyEvent.VK_K); break;
				        case 'l': robot.keyPress(KeyEvent.VK_L); break;
				        case 'm': robot.keyPress(KeyEvent.VK_M); break;
				        case 'n': robot.keyPress(KeyEvent.VK_N); break;
				        case 'o': robot.keyPress(KeyEvent.VK_O); break;
				        case 'p': robot.keyPress(KeyEvent.VK_P); break;
				        case 'q': robot.keyPress(KeyEvent.VK_Q); break;
				        case 'r': robot.keyPress(KeyEvent.VK_R); break;
				        case 's': robot.keyPress(KeyEvent.VK_S); break;
				        case 't': robot.keyPress(KeyEvent.VK_T); break;
				        case 'u': robot.keyPress(KeyEvent.VK_U); break;
				        case 'v': robot.keyPress(KeyEvent.VK_V); break;
				        case 'w': robot.keyPress(KeyEvent.VK_W); break;
				        case 'x': robot.keyPress(KeyEvent.VK_X); break;
				        case 'y': robot.keyPress(KeyEvent.VK_Y); break;
				        case 'z': robot.keyPress(KeyEvent.VK_Z); break;		        
				         // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
				        case 'A': robot.keyPress(KeyEvent.VK_SHIFT); robot.keyPress(KeyEvent.VK_A); robot.keyRelease(KeyEvent.VK_SHIFT); break;			        
				        case 'B': robot.keyPress(KeyEvent.VK_SHIFT); robot.keyPress(KeyEvent.VK_B); robot.keyRelease(KeyEvent.VK_SHIFT); break;
				        case 'C': robot.keyPress(KeyEvent.VK_SHIFT); robot.keyPress(KeyEvent.VK_C); robot.keyRelease(KeyEvent.VK_SHIFT); break;
				        case 'D': robot.keyPress(KeyEvent.VK_SHIFT); robot.keyPress(KeyEvent.VK_D); robot.keyRelease(KeyEvent.VK_SHIFT); break;
				        case 'E': robot.keyPress(KeyEvent.VK_SHIFT); robot.keyPress(KeyEvent.VK_E); robot.keyRelease(KeyEvent.VK_SHIFT); break;
				        case 'F': robot.keyPress(KeyEvent.VK_SHIFT); robot.keyPress(KeyEvent.VK_F); robot.keyRelease(KeyEvent.VK_SHIFT); break;
				        case 'G': robot.keyPress(KeyEvent.VK_SHIFT); robot.keyPress(KeyEvent.VK_G); robot.keyRelease(KeyEvent.VK_SHIFT); break;
				        case 'H': robot.keyPress(KeyEvent.VK_SHIFT); robot.keyPress(KeyEvent.VK_H); robot.keyRelease(KeyEvent.VK_SHIFT); break;
				        case 'I': robot.keyPress(KeyEvent.VK_SHIFT); robot.keyPress(KeyEvent.VK_I); robot.keyRelease(KeyEvent.VK_SHIFT); break;
				        case 'J': robot.keyPress(KeyEvent.VK_SHIFT); robot.keyPress(KeyEvent.VK_J); robot.keyRelease(KeyEvent.VK_SHIFT); break;
				        case 'K': robot.keyPress(KeyEvent.VK_SHIFT); robot.keyPress(KeyEvent.VK_K); robot.keyRelease(KeyEvent.VK_SHIFT); break;
				        case 'L': robot.keyPress(KeyEvent.VK_SHIFT); robot.keyPress(KeyEvent.VK_L); robot.keyRelease(KeyEvent.VK_SHIFT); break;
				        case 'M': robot.keyPress(KeyEvent.VK_SHIFT); robot.keyPress(KeyEvent.VK_M); robot.keyRelease(KeyEvent.VK_SHIFT); break;
				        case 'N': robot.keyPress(KeyEvent.VK_SHIFT); robot.keyPress(KeyEvent.VK_N); robot.keyRelease(KeyEvent.VK_SHIFT); break;
				        case 'O': robot.keyPress(KeyEvent.VK_SHIFT); robot.keyPress(KeyEvent.VK_O); robot.keyRelease(KeyEvent.VK_SHIFT); break;
				        case 'P': robot.keyPress(KeyEvent.VK_SHIFT); robot.keyPress(KeyEvent.VK_P); robot.keyRelease(KeyEvent.VK_SHIFT); break;
				        case 'Q': robot.keyPress(KeyEvent.VK_SHIFT); robot.keyPress(KeyEvent.VK_Q); robot.keyRelease(KeyEvent.VK_SHIFT); break;
				        case 'R': robot.keyPress(KeyEvent.VK_SHIFT); robot.keyPress(KeyEvent.VK_R); robot.keyRelease(KeyEvent.VK_SHIFT); break;
				        case 'S': robot.keyPress(KeyEvent.VK_SHIFT); robot.keyPress(KeyEvent.VK_S); robot.keyRelease(KeyEvent.VK_SHIFT); break;
				        case 'T': robot.keyPress(KeyEvent.VK_SHIFT); robot.keyPress(KeyEvent.VK_T); robot.keyRelease(KeyEvent.VK_SHIFT); break;
				        case 'U': robot.keyPress(KeyEvent.VK_SHIFT); robot.keyPress(KeyEvent.VK_U); robot.keyRelease(KeyEvent.VK_SHIFT); break;
				        case 'V': robot.keyPress(KeyEvent.VK_SHIFT); robot.keyPress(KeyEvent.VK_V); robot.keyRelease(KeyEvent.VK_SHIFT); break;
				        case 'W': robot.keyPress(KeyEvent.VK_SHIFT); robot.keyPress(KeyEvent.VK_W); robot.keyRelease(KeyEvent.VK_SHIFT); break;
				        case 'X': robot.keyPress(KeyEvent.VK_SHIFT); robot.keyPress(KeyEvent.VK_X); robot.keyRelease(KeyEvent.VK_SHIFT); break;
				        case 'Y': robot.keyPress(KeyEvent.VK_SHIFT); robot.keyPress(KeyEvent.VK_Y); robot.keyRelease(KeyEvent.VK_SHIFT); break;
				        case 'Z': robot.keyPress(KeyEvent.VK_SHIFT); robot.keyPress(KeyEvent.VK_Z); robot.keyRelease(KeyEvent.VK_SHIFT); break;	        
				        // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
				        case '´': robot.keyPress(KeyEvent.VK_DEAD_ACUTE); break;
				        case '`': robot.keyPress(KeyEvent.VK_SHIFT); robot.keyPress(KeyEvent.VK_DEAD_ACUTE); robot.keyRelease(KeyEvent.VK_SHIFT); break;
				        case '0': robot.keyPress(KeyEvent.VK_0); break;
				        case '1': robot.keyPress(KeyEvent.VK_1); break;
				        case '2': robot.keyPress(KeyEvent.VK_2); break;
				        case '3': robot.keyPress(KeyEvent.VK_3); break;
				        case '4': robot.keyPress(KeyEvent.VK_4); break;
				        case '5': robot.keyPress(KeyEvent.VK_5); break;
				        case '6': robot.keyPress(KeyEvent.VK_6); break;
				        case '7': robot.keyPress(KeyEvent.VK_7); break;
				        case '8': robot.keyPress(KeyEvent.VK_8); break;
				        case '9': robot.keyPress(KeyEvent.VK_9); break;
				        case '-': robot.keyPress(KeyEvent.VK_MINUS); break;
				        case '=': robot.keyPress(KeyEvent.VK_EQUALS); break;			      
				        case '~': robot.keyPress(KeyEvent.VK_DEAD_TILDE); break;		        
				        case '!': robot.keyPress(KeyEvent.VK_SHIFT); robot.keyPress(KeyEvent.VK_1); robot.keyRelease(KeyEvent.VK_SHIFT); break;
				        case '@': robot.keyPress(KeyEvent.VK_SHIFT); robot.keyPress(KeyEvent.VK_2); robot.keyRelease(KeyEvent.VK_SHIFT); break;
				        case '#': robot.keyPress(KeyEvent.VK_SHIFT); robot.keyPress(KeyEvent.VK_3); robot.keyRelease(KeyEvent.VK_SHIFT); break;
				        case '$':robot.keyPress(KeyEvent.VK_SHIFT); robot.keyPress(KeyEvent.VK_4); robot.keyRelease(KeyEvent.VK_SHIFT); break;			        
				        case '%': robot.keyPress(KeyEvent.VK_SHIFT); robot.keyPress(KeyEvent.VK_5); robot.keyRelease(KeyEvent.VK_SHIFT); break;			        
				        case '&': robot.keyPress(KeyEvent.VK_SHIFT); robot.keyPress(KeyEvent.VK_7); robot.keyRelease(KeyEvent.VK_SHIFT); break;
				        case '*': robot.keyPress(KeyEvent.VK_SHIFT); robot.keyPress(KeyEvent.VK_8); robot.keyRelease(KeyEvent.VK_SHIFT); break;
				        case '(': robot.keyPress(KeyEvent.VK_SHIFT); robot.keyPress(KeyEvent.VK_9); robot.keyRelease(KeyEvent.VK_SHIFT); break;
				        case ')': robot.keyPress(KeyEvent.VK_SHIFT); robot.keyPress(KeyEvent.VK_0); robot.keyRelease(KeyEvent.VK_SHIFT); break;		        
				        case '_': robot.keyPress(KeyEvent.VK_SHIFT); robot.keyPress(KeyEvent.VK_MINUS); robot.keyRelease(KeyEvent.VK_SHIFT); break;
				        case '+': robot.keyPress(KeyEvent.VK_SHIFT); robot.keyPress(KeyEvent.VK_EQUALS); robot.keyRelease(KeyEvent.VK_SHIFT); break;
				        case '\t': robot.keyPress(KeyEvent.VK_TAB); break;
				        case '\n': robot.keyPress(KeyEvent.VK_ENTER); break;
				        case '[': robot.keyPress(KeyEvent.VK_OPEN_BRACKET); break;
				        case ']': robot.keyPress(KeyEvent.VK_CLOSE_BRACKET); break;
				        case '\\': robot.keyPress(KeyEvent.VK_BACK_SLASH); break;			        
				        case '{': robot.keyPress(KeyEvent.VK_SHIFT); robot.keyPress(KeyEvent.VK_OPEN_BRACKET); robot.keyRelease(KeyEvent.VK_SHIFT); break;
				        case '}': robot.keyPress(KeyEvent.VK_SHIFT); robot.keyPress(KeyEvent.VK_CLOSE_BRACKET); robot.keyRelease(KeyEvent.VK_SHIFT); break;
				        case ';': robot.keyPress(KeyEvent.VK_SEMICOLON); break;
				        case ':': robot.keyPress(KeyEvent.VK_SEMICOLON); break;
				        //case '\'': robot.keyPress(KeyEvent.VK_QUOTE); break;
				        case '"': robot.keyPress(KeyEvent.VK_SHIFT); robot.keyPress(KeyEvent.VK_QUOTE); robot.keyRelease(KeyEvent.VK_SHIFT); break;			
				        case ',': robot.keyPress(KeyEvent.VK_COMMA); break;			        
				        case '<': robot.keyPress(KeyEvent.VK_COMMA); break;			        
				        case '.': robot.keyPress(KeyEvent.VK_PERIOD); break;			        
				        case '>': robot.keyPress(KeyEvent.VK_PERIOD); break;
				        case '^': robot.keyPress(KeyEvent.VK_SHIFT); robot.keyPress(KeyEvent.VK_DEAD_TILDE); robot.keyRelease(KeyEvent.VK_SHIFT); break;
				        case '/': robot.keyPress(KeyEvent.VK_SLASH); break;			        
				        case '?': robot.keyPress(KeyEvent.VK_SLASH); break;			        
				        case ' ': robot.keyPress(KeyEvent.VK_SPACE); break;
			        default:
			            throw new IllegalArgumentException("O caractere " + acao + " não foi encontrado na listagem.");
			        }// if  / else
		        } // 
			} // for
	} // */
	
	@Test
	@DisplayName("Teste de Teste 01")
	public void mtm() throws Exception {
		System.out.println("Teste de Teste 01");
		
		informarTextoDireto("tcDown");
		informarTextoDireto("tcDown");
		informarTextoDireto("Goiania=_~-+&%** []{}\" ´a ` ^a ");
		informarTextoDireto("tcEnter");
	}
	
	//@Test
	@DisplayName("Teste de Teste 02")
	public void mtm2() {
		System.out.println("Teste de Teste 02");
	}
	
	//@Test
	@DisplayName("Teste de Teste 03")
	public void mtm3() {
		System.out.println("Teste de Teste 03");
	}
	
}
