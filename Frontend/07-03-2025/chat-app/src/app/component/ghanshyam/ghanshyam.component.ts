import { Component } from '@angular/core';
import { ChatService } from '../../services/chat.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-ghanshyam',
  imports: [CommonModule],
  templateUrl: './ghanshyam.component.html',
  styleUrl: './ghanshyam.component.css',
})
export class GhanshyamComponent {
  constructor(public cs: ChatService) {}
  sendMessage(message: string) {
    this.cs.sendMessage('Ghanshyam: ' + message);
  }
}
