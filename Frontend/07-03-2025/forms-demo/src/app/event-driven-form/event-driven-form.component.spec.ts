import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EventDrivenFormComponent } from './event-driven-form.component';

describe('EventDrivenFormComponent', () => {
  let component: EventDrivenFormComponent;
  let fixture: ComponentFixture<EventDrivenFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [EventDrivenFormComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EventDrivenFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
