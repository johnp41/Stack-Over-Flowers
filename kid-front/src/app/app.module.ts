import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterModule, Routes } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { AgmCoreModule } from '@agm/core';
import { NgxPaginationModule } from 'ngx-pagination';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { UserLoginComponent } from './user-login/user-login.component';
import { ParentRegisterComponent } from './parent-register/parent-register.component';
import { ProviderRegisterComponent } from './provider-register/provider-register.component';
import { ConfirmPasswordDirective } from './directives/confirm-password.directive';

import { fakeBackendProvider } from './helpers/fakebackend';
import { HTTP_INTERCEPTORS } from '@angular/common/http';

import { UserLoginService } from './services/user-login.service';
import { CurrentUserService } from './services/current-user.service';
import { ParentRegisterService } from './services/parent-register.service';
import { ProviderRegisterService } from './services/provider-register.service';
import { EventRegisterService } from './services/event-register.service';
import { EventService } from './services/event.service';
import { PurchaseService } from './services/purchase.service';
import { HomeToSearchService } from './services/home-to-search.service';
import { ParentService } from './services/parent.service';
import { ProviderService } from './services/provider.service';
import { ParentProfGuardService, PointsGuardService, EventRegGuardService, ControlGuardService } from './services/guard.service';
import { AdminService } from './services/admin.service';
import { NewPassService } from './services/new-pass.service';

import { FaqComponent } from './faq/faq.component';
import { AboutUsComponent } from './about-us/about-us.component';
import { ContactComponent } from './contact/contact.component';
import { ErrorComponent } from './error/error.component';
import { TermsComponent } from './terms/terms.component';
import { PointsComponent } from './points/points.component';
import { ParentProfileComponent } from './parent-profile/parent-profile.component';
import { ProviderProfileComponent } from './provider-profile/provider-profile.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { ControlPanelComponent } from './control-panel/control-panel.component';
import { EventRegisterComponent } from './event-register/event-register.component';
import { SearchComponent } from './search/search.component';
import { EventPageComponent } from './event-page/event-page.component';
import { ResetPassComponent } from './reset-pass/reset-pass.component';



@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    UserLoginComponent,
    ParentRegisterComponent,
    ProviderRegisterComponent,
    ConfirmPasswordDirective,
    FaqComponent,
    AboutUsComponent,
    ContactComponent,
    ErrorComponent,
    TermsComponent,
    PointsComponent,
    ParentProfileComponent,
    ProviderProfileComponent,
    AdminLoginComponent,
    ControlPanelComponent,
    SearchComponent,
    EventPageComponent,
    EventRegisterComponent,
    ResetPassComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    HttpClientModule,
    NgxPaginationModule,
    AgmCoreModule.forRoot({
      apiKey: 'AIzaSyAmpQrI36e1gOYE-8bE6mBVzNkMKiEIwfw'
    })
  ],
  providers: [
    UserLoginService,
    CurrentUserService,
    ParentRegisterService,
    ProviderRegisterService,
    EventRegisterService,
    EventService,
    PurchaseService,
    HomeToSearchService,
    ParentService,
    ProviderService,
    ParentProfGuardService,
    PointsGuardService,
    EventRegGuardService,
    AdminService,
    ControlGuardService,
    NewPassService,
    fakeBackendProvider
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
