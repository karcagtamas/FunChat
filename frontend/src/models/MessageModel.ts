export class MessageModel {
  id = 0;
  message = "";
  sent = new Date();
  sender = "";

  constructor(message: string) {
    this.message = message;
  }
}
