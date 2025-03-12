import { Injectable } from '@angular/core';
import { LogService } from './log.service';

@Injectable({
  providedIn: 'root',
})
export class ChatService {
  public messages: string[] = [];
  constructor(private ls: LogService) {}

  sendMessage(message: string): void {
    this.messages.push(message);
    this.ls.log(`Sending message: ${message}`);
  }
}
