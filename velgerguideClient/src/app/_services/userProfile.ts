import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpRequest, HttpEventType, HttpErrorResponse } from '@angular/common/http' 
import { Observable, throwError } from 'rxjs';
import { catchError, retry } from 'rxjs/operators';

const PATIENT_API = 'http://localhost:8092/userProfile/';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable({
  providedIn: 'root'
})
export class PatientService {
  [x: string]: any;

  constructor(private http: HttpClient) { }

   // Handle API errors
   handleError(error: HttpErrorResponse){
    console.log("error");
    return throwError(error);
    }

  registerUserProfile(userProfile): Observable<any> {
    return this.http.post(PATIENT_API + 'registerPatient', userProfile, httpOptions);
  } 
  getUserProfilesList(): Observable<any> {
    return this.http.get(PATIENT_API +'getUserProfilesList');
  }
  getPatientById(id: number): Observable<any> {
    return this.http.get(PATIENT_API + 'getPatientById' + '/' + id, httpOptions);
  }
  getPatientByPersonalId(personalId: number): Observable<Object> {
    return this.http.get(PATIENT_API + 'getPatientByPersonalId' + '/' + personalId, httpOptions)
    .pipe(retry(2),catchError(this.handleError));      
}
  updatePatient(id: number, value: any): Observable<Object> {
    return this.http.put(`${this.PATIENT_API + 'updatePatient'}/${id}`, value);
  }

  deletePatient(id: number): Observable<any> {
    return this.http.delete(`${this.PATIENT_API +'deletePatient'}/${id}`, { responseType: 'text' });
  }
//uplading files
  upload(formData) {
    return this.http.post<any>(PATIENT_API +'add-document-' + '/' + 17, formData, httpOptions) 
      .subscribe(events => {
        if(events.type == HttpEventType.UploadProgress) {
            console.log('Upload progress: ', Math.round(events.loaded / events.total * 100) + '%');
        } else if(events.type === HttpEventType.Response) {
            console.log(events);
        }
    }) 
  }
  getFiles(): Observable<any> {
    return this.http.get(`${this.baseUrl}/files`);
  }
  //HdBaseLine
  registerHdBaseLine(HdBaseLine): Observable<any> {
    return this.http.post(PATIENT_API + 'registerHdBaseLine', HdBaseLine, httpOptions);
  } 
  
  getHdBaseLineByPersonalId(personalId: number): Observable<Object> {
    return this.http.get(PATIENT_API + 'getHdBaseLineByPersonalId' + '/' + personalId, httpOptions);
    console.log("sendt");
  }

  //HdMonthlyFolowUp
  registerHdMonthlyfollowUp(HdMonthlyFolowUp): Observable<any> {
    return this.http.post(PATIENT_API + 'registerHdMonthlyfollowUp', HdMonthlyFolowUp, httpOptions);
  } 
  getHdMonthlyfollowUpByPersonalId(personalId: number): Observable<any> {
    return this.http.get(PATIENT_API + 'getHdMonthlyfollowUpByPersonalId' + '/' + personalId, httpOptions);
  }
  //Donor
  registerDonor(Donor): Observable<any> {
   return this.http.post(PATIENT_API + 'registerDonor', Donor, httpOptions);
  } 
  getDonorByPersonalId(personalId: number): Observable<Object> {
   return this.http.get(PATIENT_API + 'getDonorByPersonalId' + '/' + personalId, httpOptions);
  } 
  getDonorsList(): Observable<any> {
    return this.http.get(PATIENT_API +'getDonorsList');
  }
  //Transplant
  registerTransplant(Transplant): Observable<any> {
    return this.http.post(PATIENT_API + 'registerTransplant', Transplant, httpOptions);
  } 
  getTransplantByPersonalId(personalId: number): Observable<any> {
    return this.http.get(PATIENT_API + 'getTransplantByPersonalId' + '/' + personalId, httpOptions);
  }
  getTransplantList(): Observable<any> {
    return this.http.get(PATIENT_API +'getTransplantList');
  }
  //TrFollowUp
  registerTrFollowUp(TrFollowUp): Observable<any> {
    return this.http.post(PATIENT_API + 'registerTrFollowUp', TrFollowUp, httpOptions);
  } 
  getTrFollowUpByPersonalId(personalId: number): Observable<any> {
    return this.http.get(PATIENT_API + 'getTrFollowUpByPersonalId' + '/' + personalId, httpOptions);
  }
  getTrFollowUpsList(): Observable<any> {
    return this.http.get(PATIENT_API +'getTrFollowUpsList');
  }

 
 }
 
 
