import { Component } from '@angular/core';
import {OAuthService} from "angular-oauth2-oidc";
import {authconfig} from "../../auth.config";
import {AppService} from "./app.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'frontend';
  constructor(private oauthService: OAuthService, private appService : AppService) {
    this.configure();
    this.appService.getHello().subscribe((data) => {
      console.log(data);
    });

  }

  private configure() {
    this.oauthService.configure(authconfig);
    this.oauthService.loadDiscoveryDocumentAndTryLogin();
  }

  login() {
    this.oauthService.initImplicitFlow();
  }

  logout() {
    this.oauthService.logOut();
  }
}
