import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddBatallaComponent } from './add-batalla.component';

describe('AddBatallaComponent', () => {
  let component: AddBatallaComponent;
  let fixture: ComponentFixture<AddBatallaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AddBatallaComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AddBatallaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
