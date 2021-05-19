<template>
  <div class="message">
    {{ message.message }}
  </div>
</template>

<script>
import { Options, Vue } from "vue-class-component";
import { MessageModel } from "@/models/MessageModel";

@Options({ props: { message: MessageModel } })
export default class MessageComponent extends Vue {}
</script>

<style scoped>
.message {
  border: 1px solid black;
  background-color: lightcyan;
  border-radius: 8px;
  padding: 0.4rem;
  margin: 0.2rem;
  width: auto;
}
</style>
