import { Component, ViewChild, ElementRef } from '@angular/core';
import { Subscription, Observable, of } from 'rxjs';
import { User } from './user';
import { AuthService } from './_services/auth.service';
import { HttpEventType, HttpErrorResponse, HttpEvent } from '@angular/common/http';
import { catchError, map } from 'rxjs/operators';
import { ThrowStmt } from '@angular/compiler';
import { FormArray } from '@angular/forms';
import { TokenStorageService } from './_services/token-storage.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  template: `
  <nav class="navbar">
    <!-- logo -->
    <div class="navbar-brand">
      <a class="navbar-item">
        <img src="assets/img/partilogoer.jpg">
      </a>
    </div>
  </nav>
`,
styles: []
})
export class AppComponent {
  title = 'vegerguideClient';
  //autherity
  isLoggedIn = false;
  username: string;
  roles: [];
  currentUser: any;
  formLogin: any = {};
  isLoginFailed = false;
  errorMessage = '';
  [x: string]: any;
  formRegisterUser: any = {};
  isSuccessful = false;
  isSignUpFailed = false;
  rolesProfiles: [];
  namePattern = "[a-zA-Z ]*";
  mobNumberPattern = "[0-9]*";
  pwdPattern = "^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?!.*\s).{6,12}$";
  isCollapsed = true;

  showUserProfileRegisterForm : boolean;
  showLogin : boolean;
  showAbout : boolean;
  showStatic: boolean;
  showTest: boolean;
  showFaq: boolean;
  showContact: boolean;

  constructor(
    private authService: AuthService,
    private tokenStorage: TokenStorageService,
    private tokenStorageService: TokenStorageService,
    private token: TokenStorageService
  ){}

  ngOnInit() {
    this.currentUser = this.token.getUser();

    if (this.tokenStorage.getToken()) {
      this.isLoggedIn = true;
      this.username=this.tokenStorage.getUser().userName;
      this.roles = this.tokenStorage.getUser().roles;
    }
    if (this.isLoggedIn) {
      const user = this.tokenStorageService.getUser();
      this.roles = user.roles;
      this.username = user.username;
      console.log(this.username)
      console.log(this.roles)

    }
    this.closeAllForms();
  }
  closeAllForms(){
    this.showUserProfileRegisterForm = false;
    this.showLogin = false;
    this.showAbout = false;
    this.showStatic = false;
    this.showTest = false;
    this.showFaq = false;
    this.showContact = false;
  }
  onSubmitShowLogin(){
    this.showLogin = true;
    this.showAbout = false;
    this.showUserProfileRegisterForm = false;
    this.showStatic = false;
    this.showTest = false;
    this.showFaq = false;
    this.showContact = false;
  }
  onSubmitShowAbout(){
    this.showAbout = true;
    this.showLogin = false;
    this.showUserProfileRegisterForm = false;
    this.showStatic = false;
    this.showTest = false;
    this.showFaq = false;
    this.showContact = false;
  }
  onSubmitShowUserProfileRegisterForm(){
    this.showUserProfileRegisterForm = true;
    this.showLogin = false;
    this.showAbout = false;
    this.showStatic = false;
    this.showTest = false;
    this.showFaq = false;
    this.showContact = false;
  }
  onSubmitShowStatic(){
    this.showStatic = true;
    this.showAbout = false;
    this.showLogin = false;
    this.showUserProfileRegisterForm = false;
    this.showTest = false;
    this.showFaq = false;
    this.showContact = false;
  }

  onSubmitShowTest(){
    this.showTest = true;
    this.showStatic = false;
    this.showAbout = false;
    this.showLogin = false;
    this.showUserProfileRegisterForm = false;
    this.showFaq = false;
    this.showContact = false;
  }

  onSubmitShowContact() {
    this.showContact =true;
    this.showTest = false;
    this.showStatic = false;
    this.showAbout = false;
    this.showLogin = false;
    this.showUserProfileRegisterForm = false;
    this.showFaq = false;
  }

  onSubmitShowFaq() {
    this.showFaq = true;
    this.showTest = false;
    this.showStatic = false;
    this.showAbout = false;
    this.showLogin = false;
    this.showUserProfileRegisterForm = false;
    this.showContact = false;
  }

  onSubmitLogin() {
    this.authService.login(this.formLogin).subscribe(
      data => {
        this.tokenStorage.saveToken(data.accessToken);
        this.tokenStorage.saveUser(data);

        this.isLoginFailed = false;
        this.isLoggedIn = true;
        this.roles = this.tokenStorage.getUser().roles;
        this.reloadPage();
      },
      err => {
        this.errorMessage = err.error.message;
        this.isLoginFailed = true;
      }
    );
  }

  reloadPage() {
    window.location.reload();
  }

  logout() {
    this.tokenStorageService.signOut();
    window.location.reload();
  }

  onSubmitRegisterUserProfile(){}
  upateUser(user: User){
    this.newUser=false;
    this.formRegisterUser=user;
    this.showUserRegisterForm= true;
  }
  onSubmitRegisterUser() {
    this.authService.register(this.formRegisterUser).subscribe(
      data => {
        console.log(data);
        this.isSuccessful = true;
        this.isSignUpFailed = false;
      },
      err => {
        this.errorMessage = err.error.message;
        this.isSignUpFailed = true;
      }
    );
}
onsubmitShowUserList(){
  this.closeAllForms();
  this.showPatientPage=false;
  this.authService.getAllUsers().subscribe((result)=>{
  this.users = result;})
  this.showUsersList = true;
}

onsubmitShowUserRegisterForm(){
  this.closeAllForms();
  this.showUserRegisterForm = true;
}


loadRolesProfiles(){
    this.authService.getRoles().subscribe(_data => {
      //this.rolesProfiles = data;
    });
  }
}
template: `
  <img src="assets/img/logo.png">
`


