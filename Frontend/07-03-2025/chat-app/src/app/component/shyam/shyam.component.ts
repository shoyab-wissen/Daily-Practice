import { Component } from '@angular/core';
import { ChatService } from '../../services/chat.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-shyam',
  imports: [CommonModule],
  templateUrl: './shyam.component.html',
  styleUrl: './shyam.component.css',
})
export class ShyamComponent {
  constructor(public cs: ChatService) {}
  sendMessage(message: string) {
    this.cs.sendMessage('Shyam: ' + message);
  }
}
