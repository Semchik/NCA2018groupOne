import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs/Observable";

const url = "/recovery";

@Injectable()
export class PasswordRecoveryService {

  constructor(private http: HttpClient) { }

  recoverPassword(email: string) {
    console.log("send mail to " + email);
    this.http.get(url + `?email=${email}`);
  }
}
