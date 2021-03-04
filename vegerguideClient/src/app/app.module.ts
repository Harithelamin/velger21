import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { NavbarUserComponent } from './navbar-user/navbar-user.component';

@NgModule({
  declarations: [
    NavbarUserComponent,
    AppComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [ AppComponent,]
})
export class AppModule { }
