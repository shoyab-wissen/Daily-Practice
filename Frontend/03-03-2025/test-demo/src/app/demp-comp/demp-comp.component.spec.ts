import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DempCompComponent } from './demp-comp.component';

describe('DempCompComponent', () => {
  let component: DempCompComponent;
  let fixture: ComponentFixture<DempCompComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [DempCompComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DempCompComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
