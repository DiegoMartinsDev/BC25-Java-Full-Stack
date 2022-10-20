import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css']
})
export class CardComponent implements OnInit {


  @Input() 
  banner: string = 'https://images.unsplash.com/file-1636585210491-f28ca34ea8ecimage?dpr=2&auto=format&fit=crop&w=416&q=60'

  @Input()
  titulo: string = 'Lorem ipsum dolor sit amet cconsectetur '

  @Input()
  username: string = 'Diego Martins'

  @Input()
  userFoto: string = 'https://avatars.githubusercontent.com/u/95890180?v=4'

  @Input()
  corBtn: string = 'black'


  constructor() { }

  ngOnInit(): void {
  }

}
