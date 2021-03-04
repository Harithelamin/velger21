import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { NavbarUserComponent } from './navbar-user/navbar-user.component';
import { FooterComponent } from './footer/footer.component';

@NgModule({
  declarations: [
    NavbarUserComponent,
    AppComponent,
    FooterComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [ AppComponent,]
})
export class AppModule { }
