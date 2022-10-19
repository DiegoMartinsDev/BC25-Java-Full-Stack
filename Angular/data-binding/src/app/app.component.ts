import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Angular é show'; /*utilizar valores que propriedades para mostrá-lo para o usuário*/
  
  n1: number = 0
  n2: number = 0

  tipoInput: string = 'text'

somar (x:number, y:number){
  return x+y
}
    mudarTipoDoInput(): void{
      if(this.tipoInput == 'password'){
        this.tipoInput ='text'
      } else { 
        this.tipoInput = 'password'
      }
    }
}
/**event binding: utilizado para ouvir eventos da Dom dentro do 
 * Angular
 */
/*two way data binding*/