import { Component, OnInit } from '@angular/core';
import { Produto } from '../interfaces/produto';

@Component({
  selector: 'produto-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css']
})
export class CardComponent implements OnInit {


  prod: Produto = {
    descricao:'',
    estoque: 0,
    imagem:'',
    nome:'',
    preco: 0
  }

  constructor() { }

  ngOnInit(): void {
  }

}
