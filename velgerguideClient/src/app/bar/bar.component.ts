import { Component, OnInit } from '@angular/core';
import { ChartDataSets, ChartOptions, ChartType } from 'chart.js';
import {Color, Label} from 'ng2-charts';

/**
 * legge til verdi fra db der det nå er strenger
 */
const NavnParti1 =  'part1';
const NavnParti2 = 'part2';
const NavnParti3 = 'part3';
const NavnParti4 = 'part4';
const NavnParti5 = 'part5';
const NavnParti6 = 'part6';
const NavnParti7 = 'part7';
const NavnParti8 = 'part8';
const NavnParti9 = 'part9';
const NavnParti10 = 'part10';
/**
 * parti poeng kobles kobles til data fra Database.
 */
const PoengParti1 = 40;
const PoengParti2 = 30;
const PoengParti3 = 79;
const PoengParti4 = 80;
const PoengParti5 = 100;
const PoengParti6 = 60;
const PoengParti7 = 50;
const PoengParti8 = 25;
const PoengParti9 = 25;
const PoengParti10 = 50;
/**
 * Farge på stolpene
 */
/**
 * const colorParti1 = 'blue';
 * *const colorParti2 = 'green';
 * const colorParti3 = 'blue';
 * const colorParti4 = 'green';
 * const colorParti5 = 'green';
 * const colorParti6 = 'red';
 * const colorParti7 = 'green';
 * const colorParti8 = 'red';
 * const colorParti9 = 'blue';
 * const colorParti10 = 'blac';
 */

@Component({
  selector: 'app-bar',
  templateUrl: './bar.component.html',
  styleUrls: ['./bar.component.css']
})

export class BarComponent implements OnInit {
 public barChartOptions: ChartOptions = {
    responsive: true,
  };
 public barChartLabels: Label[] = [NavnParti1, NavnParti2, NavnParti3, NavnParti4,
   NavnParti5, NavnParti6, NavnParti7, NavnParti8, NavnParti9, NavnParti10];
 public barChartType: ChartType = 'bar';
 public barChartLegend = true;
 public barChartPlugins = [{
 }];

 public barChartData: ChartDataSets[] = [
   {data: [ PoengParti1, PoengParti2, PoengParti3, PoengParti4,
       PoengParti5, PoengParti6, PoengParti7, PoengParti8,
       PoengParti9, PoengParti10], label: 'Poeng'},
  ];
 public barChartColors: Color[] = [
   {backgroundColor: 'blue'},
 ];
  constructor() {}
  ngOnInit() {}

}


