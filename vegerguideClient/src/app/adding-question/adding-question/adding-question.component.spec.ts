import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddingQuestionComponent } from './adding-question.component';

describe('AddingQuestionComponent', () => {
  let component: AddingQuestionComponent;
  let fixture: ComponentFixture<AddingQuestionComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddingQuestionComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddingQuestionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
